const axios = require("axios");
const functions = {
  sum: (a, b) => a + b,
  fetchUsers: async () => {
    const response = await axios.get(
      "https://jsonplaceholder.typicode.com/users"
    );
    return response;
  },
  fetchUser: async (id) => {
    const response = await axios.get(
      `https://jsonplaceholder.typicode.com/users/${id}`
    );
    return response;
  },
  invalidRequest: async () => {
    const response = await axios.get(
      "https://jsonplaceholder.typicode.com/userss/"
    );
    return response;
  },
  postUser: async (userData) => {
    const response = axios.post("/posts")
    return response;
  }
};

module.exports = functions;

