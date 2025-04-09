// Select showtime and navigate to another page
function selectShowTime() {
    let movie = localStorage.getItem("movie") || "Select Movie";
    let theater = localStorage.getItem("theater") || "Select Theater";

    localStorage.setItem("movie", movie);
    localStorage.setItem("theater", theater);
    window.location.href = "../pages/showTime.html";
}

// Handle seat selection
function selectSeat(seat, seatId) {
    if (seat.classList.contains("occupied")) {
        return;
    }

    seat.classList.toggle("selected");

    const seatPrice = parseInt(seat.getAttribute("data-price"));
    const seatLabel = seat.getAttribute("data-seat-label");

    if (seat.classList.contains("selected")) {
        selectedSeats.push({
            id: seatId,
            label: seatLabel,
            price: seatPrice,
            type: seat.getAttribute("data-type"),
        });
    } else {
        selectedSeats = selectedSeats.filter((s) => s.id !== seatId);
    }

    updateTotalPrice();
}

// Update total price display
function updateTotalPrice() {
    const totalPrice = selectedSeats.reduce((sum, seat) => sum + seat.price, 0);
    totalPriceElement.innerHTML = `<strong>${totalPrice}</strong>`;
}

// Handle payment processing
document.getElementById("processPayment").addEventListener("click", () => {
    if (selectedSeats.length === 0) {
        alert("Please select at least one seat.");
        return;
    }

    const username = localStorage.getItem("loggedInUser");
    if (!username) {
        alert("Please Login.");
        return;
    }

    let seatDetails =
        selectedSeats
            .map((seat) => {
                return `Seat: ${seat.label}, Type: ${seat.type}, Price: $${seat.price}`;
            })
            .join("<br>") + `<hr><strong>User: ${username}</strong>`;

    const totalAmount = selectedSeats.reduce((sum, seat) => sum + seat.price, 0);

    document.getElementById("paymentDetails").innerHTML = seatDetails;
    document.getElementById("totalModalPrice").innerHTML = `<strong>Total Price: $${totalAmount}</strong>`;

    const paymentModal = new bootstrap.Modal(document.getElementById("paymentModal"));
    paymentModal.show();
});

let selectedPaymentMethod = "";

// QR payment
document.getElementById("qrPayment").addEventListener("click", () => {
    selectedPaymentMethod = "QR";
    document.getElementById("qrPayment").classList.add("active", "btn-primary");
    document.getElementById("cashPayment").classList.remove("active", "btn-success");
    document.getElementById("qrPayment").classList.remove("btn-outline-primary");
    document.getElementById("cashPayment").classList.add("btn-outline-success");

    document.getElementById("qrInstructions").style.display = "block";
    document.getElementById("cashInstructions").style.display = "none";
    document.getElementById("demoQRCode").style.display = "block";
});

// Cash payment
document.getElementById("cashPayment").addEventListener("click", () => {
    selectedPaymentMethod = "Cash";
    document.getElementById("cashPayment").classList.add("active", "btn-success");
    document.getElementById("qrPayment").classList.remove("active", "btn-primary");
    document.getElementById("cashPayment").classList.remove("btn-outline-success");
    document.getElementById("qrPayment").classList.add("btn-outline-primary");

    document.getElementById("qrInstructions").style.display = "none";
    document.getElementById("cashInstructions").style.display = "block";
    document.getElementById("demoQRCode").style.display = "none";
});

// Confirm payment
document.getElementById("confirmPayment").addEventListener("click", () => {
    if (!selectedPaymentMethod) {
        alert("Please select a payment method.");
        return;
    }

    let paymentMessage = "";
    if (selectedPaymentMethod === "QR") {
        paymentMessage = "You selected QR payment. Please scan the QR code to complete the payment.";
    } else {
        paymentMessage = "You selected Cash payment. Please pay the total amount at the counter.";
    }

    alert(paymentMessage);

    if (selectedPaymentMethod === "QR") {
        setTimeout(() => {
            const qrModal = new bootstrap.Modal(document.getElementById("qrModal"));
            qrModal.show();
        }, 100);
        clearLocalStorage();
    } else {
        clearLocalStorage();
        window.location.href = "../home.html";
    }

    const paymentModalElement = document.getElementById("paymentModal");
    const paymentModal = bootstrap.Modal.getInstance(paymentModalElement);
    if (paymentModal) {
        paymentModal.hide();
    }

    document.getElementById("qrInstructions").style.display = "none";
    document.getElementById("cashInstructions").style.display = "none";
});

// Clear booking data
function clearLocalStorage() {
    localStorage.removeItem("selectedDate");
    localStorage.removeItem("selectedMovie");
    localStorage.removeItem("selectedShowTime");
    localStorage.removeItem("selectedSystemType");
    localStorage.removeItem("selectedTheater");
    localStorage.removeItem("movie");
    localStorage.removeItem("theater");
}

// Load Showtime info on page load
window.onload = function () {
    let selectedDate = localStorage.getItem("selectedDate");
    let selectedShowTime = localStorage.getItem("selectedShowTime");
    let selectedMovie = localStorage.getItem("selectedMovie");
    let selectedTheater = localStorage.getItem("selectedTheater");
    let selectedSystemType = localStorage.getItem("selectedSystemType");

    let showtimeDisplay = document.createElement("p");
    showtimeDisplay.innerHTML = `<strong>Movie:</strong> ${selectedMovie} <br>
                                 <strong>Theater:</strong> ${selectedTheater} <br>
                                 <strong>System:</strong> ${selectedSystemType} <br>
                                 <strong>Showtime:</strong> ${selectedDate} at ${selectedShowTime}`;
    document.querySelector(".card-body").prepend(showtimeDisplay);
};

// Initialize seats on page load
createSeats();
