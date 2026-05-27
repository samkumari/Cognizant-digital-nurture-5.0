const events = [
    { name: "Music Fest", seats: 10, upcoming: true },
    { name: "Old Event", seats: 0, upcoming: false }
];

events.forEach(event => {
    if(event.upcoming && event.seats > 0) {
        console.log(event.name);
    }
});

try {
    let seats = 0;
    if(seats <= 0) {
        throw "No seats available";
    }
} catch(error) {
    console.log(error);
}