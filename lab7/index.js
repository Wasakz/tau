const axios = require("axios");
const functions = {
  sum: (a, b) => a + b,
  fetchUsers: async () => {
    const response =  await axios.get(
      "https://jsonplaceholder.typicode.com/users"
    );
    return response;
  },
};

module.exports = functions;
