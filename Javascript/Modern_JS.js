const event = {
    name: "Coding Workshop",
    date: "2025-08-01"
};

const { name, date } = event;

const cloned = { ...event };

console.log(name, date);