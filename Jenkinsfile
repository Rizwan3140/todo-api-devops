pipeline {
    agent any

    stages {

        stage('Clone') {
            steps {
                git branch: 'main', credentialsId: 'github-creds', url: 'https://github.com/Rizwan3140/todo-api-devops.git'
            }
        }

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
                sh 'docker build -t todo-api .'
            }
        }
    }
}

