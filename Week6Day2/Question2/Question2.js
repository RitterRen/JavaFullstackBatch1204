function getUserData() {
    const userId = document.getElementById("userIdInput").value;
    if (!userId) {
        alert("Please enter a user ID");
        return;
    }

    const infoURL = `https://jsonplaceholder.typicode.com/users/${userId}`;
    const postsURL = `https://jsonplaceholder.typicode.com/posts?userId=${userId}`;
    const todosURL = `https://jsonplaceholder.typicode.com/todos?userId=${userId}`;

    Promise.all([
        fetch(infoURL).then(response => response.json()),
        fetch(postsURL).then(response => response.json()),
        fetch(todosURL).then(response => response.json())
    ]).then(data => {
        const [userInfo, userPosts, userTodos] = data;
        
        if (!userInfo || !userInfo.id) {
            document.getElementById('result').innerHTML = 'User was not found. Please try another user ID';
            return;
        }

        const resultHtml = `<h2>User Information</h2>${generateTable(userInfo)}
                          <h2>User Posts</h2>${generateTable(userPosts)}
                          <h2>User Todos</h2>${generateTable(userTodos)}`;
        document.getElementById('result').innerHTML = resultHtml;
    }).catch(error => {
        document.getElementById('result').innerHTML = 'User was not found. Please try another user ID. ' + error;
    })
}

function generateTable(data) {
    if (!Array.isArray(data)) data = [data]; // Ensure data is an array
    if (data.length === 0) return '<p>No data available</p>';

    var table = '<table><tr>';
    for (var key in data[0]) {
        table += `<th>${key}</th>`;
    }
    table += '</tr>';

    data.forEach(item => {
        table += '<tr>';
        for (var key in item) {
            table += `<td>${item[key]}</td>`;
        }
        table += '</tr>';
    });

    table += '</table>';
    return table;
}