const ps = require("prompt-sync")
const prompt = ps()

let items = [];

function showMenu() {
  console.log(
    "Menu:\n" +
    "1. Add Item\n" +
    "2. Remove Item\n" +
    "3. Show Items\n" +
    "4. Exit\n");

return prompt("Enter an option (1-4): ");
}

function addItem(){
  const item = prompt("Enter item to add: ")
	items.push(item)
  console.log(` "${item}" added to the list `)
	}


function removeItem(){
  const input = prompt("Enter item to remove: ")
  const index = index.indexOf(input)
  if(index >= 0 && index < items.length ){
  const removed = items.splice(index, 1)
  console.log(`Removed "${removed[0]}" from the list `)}
	else{console.log("Invalid number.")}
	}

function removeItem() {
  const index = items.indexOf(input);
  if (index !== -1) {
    items.splice(index, 1);
    console.log(`${input} removed successfully.`);
  } else {
    console.log(`${input} not found in the list.`);
  }
}


function availableItems() {
  if (items.length === 0) {
    console.log("No items in the list.");
  } else {
    console.log("Items:");
    items.forEach((item, index) => {
      console.log(`${index + 1}. ${item}`);
    });
  }
}


while (true) {
  const option = showMenu();

  switch (option) {
    case "1":
      addItem();
      break;
    case "2":
      removeItem();
      break;
    case "3":
      availableItems();
      break;
    case "4":
      console.log("Exiting program. Goodbye!");
      process.exit(0);
    default:
      console.log("Invalid choice. Please enter a number from 1 to 4.");
  }
}*/




