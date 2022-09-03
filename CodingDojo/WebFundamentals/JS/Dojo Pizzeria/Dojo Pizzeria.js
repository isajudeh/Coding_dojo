function pizzaOven(crustType, sauceType, cheese, toppings) {
    var Pizza = {};
    Pizza.crustType = crustType;
    Pizza.sauceType = sauceType;
    Pizza.cheese = cheese;
    Pizza.toppings = toppings;
    return Pizza;
}
    
var Pizza1 = pizzaOven("deep dish", "marinara", ["mozzarella", "feta"], ["mushrooms", "olives", "onions"]);
console.log(Pizza1);
var Pizza2 = pizzaOven("beef", "turky", "mozzarella", ["mushrooms", "olives"]);
console.log(Pizza2);
var Pizza3 = pizzaOven("chiken", "italy", "feta" , ["olives", "onions"]);
console.log(Pizza3);

// Random Pizza
function randomPizza(crustType, sauceType, cheese, toppings) {
    var Pizza = {};
    Pizza.crustType = crustType[Math.floor(Math.random()*crustType.length)];
    Pizza.sauceType = sauceType[Math.floor(Math.random()*sauceType.length)];;
    Pizza.cheese = cheese[Math.floor(Math.random()*cheese.length)];;
    Pizza.toppings = toppings[Math.floor(Math.random()*toppings.length)];;
    return Pizza;
}
var Pizza1 = randomPizza(["beef", "chiken", "deep dish"], ["marinara", "italy", "turyk"], ["mozzarella", "feta"], ["mushrooms", "olives", "onions"]);
console.log(Pizza1);
