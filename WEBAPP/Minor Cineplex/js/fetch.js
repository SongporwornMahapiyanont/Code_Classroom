fetch('../components/navbar.html')
    .then(res => res.text())
    .then(data => {
        const navbarContainer = document.getElementById('navbar-container');
        if (navbarContainer) {  // Check if the element exists
            navbarContainer.innerHTML = data;
        }
    });

fetch('../components/admin-navbar.html')
    .then(res => res.text())
    .then(data => {
        const navbarContainer = document.getElementById('navbar-admin');
        if (navbarContainer) {  // Check if the element exists
            navbarContainer.innerHTML = data;
        }
    });

fetch('../components/dropdown.html')
    .then(res => res.text())
    .then(data => {
        const dropdownContainer = document.getElementById('dropdownContainer');
        if (dropdownContainer) {  // Check if the element exists
            dropdownContainer.innerHTML = data;
        }
    });

fetch('../components/footer.html')
    .then(res => res.text())
    .then(data => {
        const footer = document.getElementById('footer');
        if (footer) {  // Check if the element exists
            footer.innerHTML = data;
        }
    });
