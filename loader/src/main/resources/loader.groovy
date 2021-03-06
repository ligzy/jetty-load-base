import org.mortbay.jetty.load.generator.Resource

return new Resource("/",
  new Resource("/css/bootstrap.min.css"),
  new Resource("/css/bootstrap-responsive.min.css"),
  new Resource("/lib/jquery.min.js"),
  new Resource("/lib/bootstrap.min.js"),
  new Resource("/lib/angular.min.js"),
  new Resource("/app.js"),
  new Resource(
    new Resource("/api/contact/search/name?q=12",
      new Resource("/api/contact/12"),
      new Resource("/api/contact/112"),
      new Resource("/api/contact/120"),
      new Resource("/api/contact/121"),
      new Resource("/api/contact/122"),
      new Resource("/api/contact/123"),
      new Resource("/api/contact/124"),
      new Resource("/api/contact/125"),
      new Resource("/api/contact/126"),
      new Resource("/api/contact/127"),
      new Resource("/api/contact/128"),
      new Resource("/api/contact/129"),
      new Resource("/api/contact/212"),
      new Resource("/api/contact/312"),
      new Resource("/api/contact/412"),
      new Resource("/api/contact/512"),
      new Resource("/api/contact/612"),
      new Resource("/api/contact/712"),
      new Resource("/api/contact/812"),
      new Resource("/api/contact/912"),
      new Resource("/api/contact/131")
)))

