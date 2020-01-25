pipeline {
    agent {
//         docker { image 'openjdk:8u242-jdk' }
        docker { image 'gradle:6.0.1-jdk8'}
    }

//     tools {
//         gradle "G6.1"
//     }

    stages {
        stage('Show User') {
            steps {
                sh 'echo $USER'
            }
        }

        stage('Compile') {
            steps {
                sh 'gradle build'
            }
        }

        stage('Unit Tests') {
            steps {
                sh 'gradle test'
            }
        }

        stage('Execute') {
            steps {
                sh 'gradle run'
            }
        }
    }
}