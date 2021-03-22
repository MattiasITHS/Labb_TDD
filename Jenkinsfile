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
                        bat 'newman run RestfulBooker.postman_collection.json --environment RestfulBooker.postman_environment.json --reporters junit'
                    }
                    post {
                        always {
                                junit '**/*xml'
                            }
                        }
                }
                stage('Robot Framework System tests with Selenium') {
                            steps {
                                bat 'robot --variable BROWSER:headlesschrome -d Results  Tests'
                            }
                            post {
                                always {
                                    script {
                                          step(
                                                [
                                                  $class              : 'RobotPublisher',
                                                  outputPath          : 'results',
                                                  outputFileName      : '**/output.xml',
                                                  reportFileName      : '**/report.html',
                                                  logFileName         : '**/log.html',
                                                  disableArchiveOutput: false,
                                                  passThreshold       : 50,
                                                  unstableThreshold   : 40,
                                                  otherFiles          : "**/*.png,**/*.jpg",
                                                ]
                                          )
                                    }
                                }
                            }
                        }
    }
}

