const axios = require("axios");
const functions = require("./index");

test("Status code should be 200", async () => {
  const response = await functions.fetchUsers();
  expect(response.status).toBe(200);
});

test("Response should have data", async () => {
  const response = await functions.fetchUsers();
  expect(response.data).toBeTruthy();
});

test("Should be at least 10 users", async () => {
  const response = await functions.fetchUsers();
  expect(response.data.length).toBeGreaterThanOrEqual(10);
});

test("First user should be Leanne Graham", async () => {
  const response = await functions.fetchUsers();
  expect(response.data[0].name).toEqual("Leanne Graham");
});

test("First user should be Leanne Graham", async () => {
  const response = await functions.fetchUsers();
  expect(response.data[0].name).toEqual("Leanne Graham");
});

test("Clementine Bauch's geo should be object with lat: -68.6102, lng: 47.0653", async () => {
  const response = await functions.fetchUser(3);
  expect(response.data.address.geo).toEqual({
    lat: "-68.6102",
    lng: "-47.0653",
  });
});

test(
  "All users should have 6 keys: " +
    "'id', 'name',\n" +
    "  'username', 'email',\n" +
    "  'address',  'phone',\n" +
    "  'website',  'company'",
  async () => {
    const response = await functions.fetchUsers();
    let keys;
    response.data.forEach((user, index) => {
      keys = Object.keys(user);
    });
    expect(keys).toEqual([
      "id",
      "name",
      "username",
      "email",
      "address",
      "phone",
      "website",
      "company",
    ]);
  }
);
