document.querySelector("form").addEventListener("submit", function(event) {
    event.preventDefault();

    const name = this.elements["name"].value;
    const email = this.elements["email"].value;

    if(name === "" || email === "") {
        console.log("Validation failed");
    } else {
        console.log("Form submitted");
    }
});