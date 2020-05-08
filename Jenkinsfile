pipeline {
    agent any

    stages {
         stage('SCM Checkout'){
           steps{
                checkout scm
           }
        }
        stage('Build') {
            steps {
                sh "/usr/share/maven/bin/mvn clean install package"
            }
        }
        stage('Test') {
            steps {
                sh 'mvn surefire:test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
    post {
        always {
            junit 'target/surefire-reports/TEST-*.xml'
        }
    }
}