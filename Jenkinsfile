pipeline {
    agent any

    environment {
        DOCKER_IMAGE = 'todo-api'
        CONTAINER_NAME = 'todo-api-container'
        PORT = '8081'
    }

    stages {
        stage('Build') {
            steps {
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('Docker Build') {
            steps {
                sh "docker build -t ${DOCKER_IMAGE} ."
            }
        }

        stage('Deploy') {
            steps {
                sh '''
                    docker rm -f ${CONTAINER_NAME} || true
                    docker run -d -p ${PORT}:${PORT} --name ${CONTAINER_NAME} ${DOCKER_IMAGE}
                '''
            }
        }
    }
}

