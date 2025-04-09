document.addEventListener("DOMContentLoaded", function () {
    checkStorageExpiration();
    fetchMovies();
    restoreSelections();
});

const EXPIRATION_TIME = 60 * 60 * 1000; // 10 seconds expiration วางยาตัวเองเฉย

// Check if stored data has expired
function checkStorageExpiration() {
    let timestamp = localStorage.getItem("timestamp");
    if (timestamp) {
        let currentTime = Date.now();
        if (currentTime - parseInt(timestamp) > EXPIRATION_TIME) {
            console.log("Storage expired. Clearing data...");
            localStorage.clear(); // Clear all local storage
        }
    }
}

function logout() {
    localStorage.clear();
    window.location.href = "../index.html";
}

function restoreSelections() {
    let savedMovie = localStorage.getItem("movie");
    let savedTheater = localStorage.getItem("theater");

    // Set the timestamp if it's not already set
    if (!localStorage.getItem("timestamp")) {
        localStorage.setItem("timestamp", Date.now().toString());
    }

    // Wait until buttons exist
    let movieBtn = document.getElementById("movieBtn");
    let theaterBtn = document.getElementById("theaterBtn");

    if (!movieBtn || !theaterBtn) {
        console.log("Buttons not found, retrying...");
        setTimeout(restoreSelections, 100); // Retry until buttons are available
        return;
    }

    if (savedMovie) movieBtn.innerText = savedMovie;
    if (savedTheater) theaterBtn.innerText = savedTheater;

    // Handle confirm showtime button
    let confirmShowTimeBtn = document.getElementById("confirmShowTimeBtn");
    if (confirmShowTimeBtn) {
        confirmShowTimeBtn.addEventListener("click", function () {
            let selectedDate = document.getElementById("showDate")?.value;
            let selectedShowTime = document.getElementById("showTimeSelect")?.value;

            if (selectedDate && selectedShowTime) {
                localStorage.setItem("selectedDate", selectedDate);
                localStorage.setItem("selectedShowTime", selectedShowTime);
                window.location.href = "../pages/selectSeats.html"; // Redirect to seat selection
            } else {
                alert("Please select a date and showtime.");
            }
        });
    }
}

// Select a movie
function selectMovie(element) {
    let movie = element.innerText;
    localStorage.setItem("movie", movie);
    // Update the timestamp whenever a new movie is selected
    localStorage.setItem("timestamp", Date.now().toString());

    // Ensure button updates right after selection
    let movieBtn = document.getElementById("movieBtn");
    if (movieBtn) movieBtn.innerText = movie;
}

// Select a theater
function selectTheater(element) {
    let theater = element.innerText;
    localStorage.setItem("theater", theater);
    // Update the timestamp whenever a new theater is selected
    localStorage.setItem("timestamp", Date.now().toString());

    // Ensure button updates right after selection
    let theaterBtn = document.getElementById("theaterBtn");
    if (theaterBtn) theaterBtn.innerText = theater;
}

function fetchMovies() {
    fetch("../movies.json") // adjust path if needed
        .then((response) => response.json())
        .then((data) => populateMovieDropdown(data))
        .catch((error) => console.error("Error loading movies:", error));
}

function populateMovieDropdown(movies) {
    const dropdown = document.getElementById("movieDropdown");
    dropdown.innerHTML = ""; // Clear existing items

    movies.forEach((movie) => {
        const li = document.createElement("li");
        const a = document.createElement("a");

        a.classList.add("dropdown-item");
        a.href = "#";
        a.innerText = movie.title;
        a.onclick = () => selectMovie(a); // Use your existing function

        li.appendChild(a);
        dropdown.appendChild(li);
    });
}
