document.getElementById("registerBtn").onclick = function() {
    alert("Registered!");
};

document.getElementById("category").onchange = function() {
    console.log("Category changed");
};

document.addEventListener("keydown", function(event) {
    console.log(event.key);
});