fetch("https://jsonplaceholder.typicode.com/posts", {
    method: "POST",
    body: JSON.stringify({
        name: "John"
    }),
    headers: {
        "Content-type": "application/json"
    }
})
.then(response => response.json())
.then(data => console.log(data))
.catch(error => console.log(error));

setTimeout(() => {
    console.log("Delayed response");
}, 2000);