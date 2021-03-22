pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/MattiasITHS/Labb_TDD.git'
                   bat '.mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                bat '.mvn test'
            }

            post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}