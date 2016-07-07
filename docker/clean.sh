echo "removing containers"
docker rm docker_service-a_1
docker rm docker_service-a_2
docker rm docker_service-b_1
docker rm docker_service-b_2
docker rm docker_service-b_3
docker rm docker_service-b_4
docker rm docker_service-registry_1
docker rm docker_zuul-proxy_1

echo "removing images"
docker rmi docker_service-a
docker rmi docker_service-b
docker rmi docker_service-registry
docker rmi docker_zuul-proxy
