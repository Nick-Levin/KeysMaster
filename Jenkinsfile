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

        stage('Execute') {
            steps {
                sh 'gradle run'
            }
        }
    }
}

def rtGradle = Artifactory.newGradleBuild()