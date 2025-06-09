<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
    <title>About Page</title>
</head>
<body>
    <nav class="navbar navbar-expand-lg bg-warning">
        
        <div class="container-fluid">
          <a class="navbar-brand" href="index.html">Animals.io</a>
          <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
          </button>
          <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                <li class="nav-item">
                    <a class="nav-link active" aria-current="page" href="index.html">Home</a>
                  </li>
                <li class="nav-item">
                <a class="nav-link active" aria-current="page" href="detail.html">Detail</a>
              </li>
              <li class="nav-item">
                <a class="nav-link" href="about.html">About</a>
              </li>
              
            </ul>
            
          </div>
        </div>
      </nav>
      <h1 class="about-h1">About Us</h1>
      <section class="about-card-sec">
        <div class="card mb-3 about-card">
            <img src="pexels-quang-nguyen-vinh-222549-2131828.jpg" class="card-img-top" alt="...">
            <div class="card-body">
              <p class="card-text">Welcome to Animal.io, your ultimate guide to exploring the amazing world of animals. We offer fun facts and detailed information on species from every corner of the globe, covering everything from diet and habitat to unique behaviors. Whether you’re curious about how bees communicate or why jellyfish glow, we make learning engaging and accessible. Our goal is to inspire curiosity and a deeper appreciation for wildlife in people of all ages. Dive in and discover the wild wonders waiting for you!</p>
             
            </div>
          </div>
        <h2>Learn More</h2>
        <form>
            <div class="mb-3">
              <label for="exampleInputEmail1" class="form-label">Email address</label>
              <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
              <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
            </div>
            <div class="mb-3">
              <label for="exampleInputPassword1" class="form-label">Message</label>
              <input type="text" class="form-control" id="exampleInputPassword1">
            </div>
            
            <button type="submit" class="btn btn-primary">Submit</button>
          </form>
        </section>
        <footer>
            <h4>Follow Us</h4>
            <div class="icon-list">
                <img class="icon" src="instagram.png">
                <img class="icon" src="facebook.png">
                <img class="icon" src="linkedin.png">
                <img class="icon" src="twitter.png">
                
    
            </div>
        </footer>
      
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js" integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO" crossorigin="anonymous"></script>
    <script src="script.js" defer></script>
</body>
</html>