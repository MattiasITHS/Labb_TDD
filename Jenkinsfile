pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                git 'https://github.com/MattiasITHS/Labb_TDD.git'
                bat "mvn compile"
            }
        }
        stage('Test') {
            steps {
                bat "mvn test"
            }

            post {
                always {
                    junit '**/TEST*.xml'
                    chuckNorris()
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
                            chuckNorris()
                    }
                }
        }
        stage('Robot Framework System tests with Selenium') {
            steps {
                bat 'robot --variable BROWSER:headlesschrome -d Results Tests/LabbWebTest.robot Tests/VG_test.robot'
                    }
                    post {
                        always {
                            script {
                                step(
                                    [
                                    $class              : 'RobotPublisher',
                                    outputPath          : 'Results',
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
                                chuckNorris()
                        }
                    }
        }
    }
}

