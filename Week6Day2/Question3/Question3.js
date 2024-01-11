function delayRequest(url) {
    fetch(url)
    .then(response => {
        if (response.ok) return response.json();
        throw new error("URL did not response sucessfully")
    })
    .then(data => {
        setTimeout(() => {
            console.log(data);
        }, 2000)
    })
    .catch(error => console.log(error))
}

// 测试函数
delayRequest('https://jsonplaceholder.typicode.com/users/1');