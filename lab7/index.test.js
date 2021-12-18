const axios = require("axios");
const functions = require('./index');

test("Status code should be 200", async () =>{
    const response = await functions.fetchUsers();
    expect(response.status).toBe(200);
})

test("Response should have data", async () =>{
    const response = await functions.fetchUsers();
    expect(response.data).toBeTruthy();
})


test("Should be at least 10 users", async () =>{
    const response = await functions.fetchUsers();
    expect(response.data.length).toBeGreaterThanOrEqual(10);
})

test("First user should be Leanne Graham", async () =>{
    const response = await functions.fetchUsers();
    expect(response.data[0].name).toEqual("Leanne Graham");
})