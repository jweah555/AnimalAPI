<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">

  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-4Q6Gf2aSP4eDXB8Miphtr37CMZZQ5oXLH2yaXMJ2w8e2ZtHTl7GptT4jmndRuHDT" crossorigin="anonymous">
  <!-- <link rel="stylesheet"  type="text/css" href="/ccs/style.css"> -->
  <link rel="stylesheet" type="text/css" href="/css/styles.css">

  <title>Home Page</title>
</head>

<body>
  <nav class="navbar navbar-expand-lg bg-primary">

    <div class="container-fluid">
      <a class="navbar-brand" href="/birds">Animals.io</a>
      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
        aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="/birds">Home</a>
          </li>
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="/birds/createForm">Create</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="/birds/update">Update Page</a>
          </li>

        </ul>

      </div>
    </div>
  </nav>
  <section class="welcome">
    <h1>Learn About Animals and Their Unique Qualities</h1>
    <h2>${title}</h2>
  </section>
  <section class="animal-list position-relative">
    <#list birdsList as bird>
      <div class="card mx-auto justify-content-center" style="width: 18rem;">


        <div class="card-body">
          <div class="card-body">
            <h5 class="card-title">Bird Name: ${bird.name?default("No Name")}</h5>
           

            <p class="card-text">Bird Breed: ${bird.breed?default("No breed")}</p>
            <p class="card-text">Bird Age: ${bird.age?default("No age")}</p>
            <p class="card-text">Bird Description: ${bird.description?default("No description")}</p>
          </div>



          <a  href="/birds/${bird.birdId?c}" class="btn btn-primary">View Animal #: ${bird.birdId?default("No Id")}</a>
        </div>
      </div>
    </#list>

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
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.6/dist/js/bootstrap.bundle.min.js"
    integrity="sha384-j1CDi7MgGQ12Z7Qab0qlWQ/Qqz24Gc6BM0thvEMVjHnfYGF0rmFCozFSxQBxwHKO"
    crossorigin="anonymous"></script>
  <script src="script.js" defer></script>
</body>

</html>