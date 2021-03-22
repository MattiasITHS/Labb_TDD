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
                        git 'https://github.com/MattiasITHS/Postman_Labb.git'
                        sh 'newman run Restful_Booker.postman_collection_Mattias_Hovde.json --environment Restful_Booker.postman_environment_Mattias_Hovde.json --reporters junit'
                    }
                    post {
                        always {
                                junit '**/*xml'
                            }
                        }
                }
    }
}

