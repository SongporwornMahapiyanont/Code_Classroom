const seatPrices = {
    normal: 10,
    vip: 20,
};

const seatsPerRow = 12; // Seats per row
const normalSeatsPerRow = 12; // Normal seats per row (first two rows)
const seatContainer = document.getElementById("seatContainer");
const totalPriceElement = document.getElementById("totalPrice");
let selectedSeats = [];

const totalSeats = normalSeatsPerRow * 2 + seatsPerRow * 2; // Total number of seats
const unavailableSeatsCount = Math.floor(totalSeats * 0.2); // 20% of seats are unavailable

// Create seats
function createSeats() {
    // First two rows: Normal seats
    for (let i = 0; i < normalSeatsPerRow * 2; i++) {
        const seat = createSeat(i, "normal");
        seatContainer.appendChild(seat);
    }

    // Last two rows: VIP seats
    for (let i = 0; i < seatsPerRow * 2; i++) {
        const seat = createSeat(i + normalSeatsPerRow * 2, "vip");
        seat.classList.add("premium");
        seatContainer.appendChild(seat);
    }

    // Make random seats unavailable (20% of total seats)
    makeRandomSeatsUnavailable();
}

// Create a seat element
function createSeat(id, seatType) {
    const seat = document.createElement("div");
    seat.classList.add("seat");

    const row = String.fromCharCode(65 + Math.floor(id / seatsPerRow)); // 'A', 'B', ...
    const seatNumber = (id % seatsPerRow) + 1;
    const seatLabel = `${row}${seatNumber}`;

    seat.setAttribute("data-seat-id", id);
    seat.setAttribute("data-seat-label", seatLabel);
    seat.setAttribute("data-price", seatPrices[seatType]);
    seat.setAttribute("data-type", seatType);
    seat.textContent = seatLabel;

    if (id % 7 === 0 || id % 9 === 0) {
        seat.classList.add("occupied");
        return seat;
    }

    seat.addEventListener("click", () => selectSeat(seat, id));

    return seat;
}

// Make random seats unavailable by applying the "occupied" class
function makeRandomSeatsUnavailable() {
    const seatElements = Array.from(seatContainer.getElementsByClassName("seat"));
    const unavailableSeats = [];

    while (unavailableSeats.length < unavailableSeatsCount) {
        const randomIndex = Math.floor(Math.random() * seatElements.length);
        const seat = seatElements[randomIndex];

        // Ensure the seat hasn't already been marked as unavailable
        if (!unavailableSeats.includes(seat) && !seat.classList.contains("occupied")) {
            seat.classList.add("occupied");
            unavailableSeats.push(seat);
        }
    }
}

createSeats();