pipeline {
    agent any
    tools {
        gradle "G6.1"
    }

    stages {
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