### Building and running your application

When you're ready, start your application by running:
`docker compose up --build`.

Your application will be available at http://localhost:8080.

### Deploying your application to the cloud

First, build your image, e.g.: `docker build -t myapp .`.
If your cloud uses a different CPU architecture than your development
machine (e.g., you are on a Mac M1 and your cloud provider is amd64),
you'll want to build the image for that platform, e.g.:
`docker build --platform=linux/amd64 -t myapp .`.

Then, push it to your registry, e.g. `docker push myregistry.com/myapp`.

Consult Docker's [getting started](https://docs.docker.com/go/get-started-sharing/)
docs for more detail on building and pushing.

Docker MySQL:

docker run --name user_service_db --rm -v /tmp/mysql-data:/var/lib/mysql -e MYSQL_USER=db_user -e MYSQL_PASSWORD=secret -e MYSQL_ROOT_PASSWORD=p@ssword -e MYSQL_DATABASE=bms -p 3306:3306 -it mysql:8.0

docker compose -f compose.yaml up --build

docker compose -f compose.yaml stop/down -v

Delete volume and start and connect - 
docker exec -it user_service_db  mysql -u root -psecret -h 127.0.0.1