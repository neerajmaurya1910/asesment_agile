pipeline {
    agent any

    environment {
        IMAGE_NAME = "demo-app"
    }

    stages {
        stage('Checkout') {
            steps {
                echo 'Pulling code from GitHub...'
                checkout scm
            }
        }

        stage('Build Docker Image') {
            steps {
                echo 'Building Docker image...'
                sh 'docker build -t ${IMAGE_NAME}:${BUILD_NUMBER} .'
            }
        }

        stage('Run Container') {
            steps {
                echo 'Running container to verify...'
                sh 'docker run --rm ${IMAGE_NAME}:${BUILD_NUMBER}'
            }
        }
    }

    post {
        success {
            echo '✅ SUCCESS: Jenkins connected to GitHub and Docker build/run worked!'
        }
        failure {
            echo '❌ Pipeline failed. Check logs above.'
        }
    }
}
