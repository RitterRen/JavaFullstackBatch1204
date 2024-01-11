console.log("Get into the JS file");
fetch('https://jsonplaceholder.typicode.com/users')
  .then(response => {
    if (!response.ok) {
      throw new Error('Network response was not ok');
    }
    return response.json();
  })
  .then(data => {
    console.log(data); // 这里是获取到的用户数据
    createUserTable(data);
  })
  .catch(error => {
    console.error('There was a problem with the fetch operation:', error);
  });

function createUserTable(data) {
    const table = document.createElement('table');
    table.style.width = '100%';
    table.setAttribute('border', '1');
    table.style.borderCollapse = 'collapse';
    table.style.textAlign = 'center';

    const thead = document.createElement('thead');
    const headerRow = document.createElement('tr');
    const headers = ['ID', 'Name', 'Username', 'Email', 'Phone', 'Website', 'Company Name']
    
    headers.forEach(headerText => {
      const header = document.createElement('th');
      const textNode = document.createTextNode(headerText);
      header.appendChild(textNode);
      headerRow.appendChild(header);
    });
    thead.appendChild(headerRow);
    table.appendChild(thead);

    // Create table row
    const tbody = document.createElement('tbody');
    data.forEach(user => {
      const row = document.createElement('tr');

      let cell = document.createElement('td');
      cell.appendChild(document.createTextNode(user.id));
      row.appendChild(cell);

      cell = document.createElement('td');
      cell.appendChild(document.createTextNode(user.name));
      row.appendChild(cell);

        cell = document.createElement('td');
        cell.appendChild(document.createTextNode(user.username));
        row.appendChild(cell);

        cell = document.createElement('td');
        cell.appendChild(document.createTextNode(user.email));
        row.appendChild(cell);

        cell = document.createElement('td');
        cell.appendChild(document.createTextNode(user.phone));
        row.appendChild(cell);

        cell = document.createElement('td');
        cell.appendChild(document.createTextNode(user.website));
        row.appendChild(cell);

        cell = document.createElement('td');
        cell.appendChild(document.createTextNode(user.company.name));
        row.appendChild(cell);

        // 将行添加到tbody
        tbody.appendChild(row);
    });
    table.appendChild(tbody);

    document.body.appendChild(table);
}