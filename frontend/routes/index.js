var express = require('express');
var router = express.Router();
var request = require('request');

/* GET home page. */
router.get('/', function(req, res, next) {
  
  request("http://localhost:8080/getBar", function(err,body){
      console.log(body.body);
  });
  
  res.render('index', { title: 'Express' });
});

module.exports = router;
