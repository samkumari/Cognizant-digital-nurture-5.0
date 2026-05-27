let events = [];

events.push("Music Event");

const musicEvents = events.filter(event => event.includes("Music"));

const formatted = events.map(event => `Workshop on ${event}`);

console.log(formatted);