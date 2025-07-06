terraform {
  required_providers {
    docker = {
      source  = "kreuzwerker/docker"
      version = "~> 2.20.0"
    }
  }
}

provider "docker" {
  host = "unix:///var/run/docker.sock"
}

resource "docker_image" "todo_api" {
  name         = "todo-api"
  keep_locally = true
}

resource "docker_container" "todo_container" {
  name  = "todo-api-tf"
  image = docker_image.todo_api.name
  ports {
    internal = 8080
    external = 8082
  }
}

