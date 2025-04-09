document.addEventListener("DOMContentLoaded", () => {
    // Hardcoded user credentials
    const users = [
        { username: "user1", password: "pass123" },
        { username: "user2", password: "pass123" },
        { username: "admin", password: "admin123" }
    ];

    const loginForm = document.querySelector("form");

    // Submit handler
    loginForm.addEventListener("submit", function (event) {
        event.preventDefault();

        const userInput = document.getElementById("InputUser1").value.trim();
        const passInput = document.getElementById("InputPassword1").value.trim();

        if (!userInput || !passInput) {
            alert("Please fill in both fields!");
            return;
        }

        const user = users.find(
            (u) => u.username === userInput && u.password === passInput
        );

        if (user) {
            localStorage.setItem("loggedInUser", user.username);

            console.log("Login successful");

            if (user.username === "admin") {
                window.location.href = "admin.html";
            } else {
                // Redirect user page if needed or show a message
                window.location.href = "home.html"; // or simply redirect somewhere else
            }
        } else {
            alert("Invalid username or password!");
        }
    });
});
