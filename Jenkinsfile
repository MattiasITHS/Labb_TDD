pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/MattiasITHS/Labb_TDD.git'
                   bat "mvn clean compile"
            }
        }
        stage('Test') {
            steps {
                bat "mvn test"
            }

            post {
                always {
                    junit '**/TEST*.xml'
                }
            }
        }
                stage('newman') {
                    steps {
                        sh 'newman run Restful_Booker_Facit.postman_collection.json --environment Restful_Booker.postman_environment.json --reporters junit'
                    }
                    post {
                        always {
                                junit '**/*xml'
                            }
                        }
                }
    }
}

