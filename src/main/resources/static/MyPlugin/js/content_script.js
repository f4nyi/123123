fetch(`http://localhost:8080/news/init`,{
    method:'GET'
}).then(response=>{
    console.log(response.json);
});
