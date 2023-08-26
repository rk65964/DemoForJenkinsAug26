pipeline {
    agent any
    tools {
        jdk 'jdk11'
        maven 'maven3'
    }
    stages {
        stage('Git Checkout') {
            steps {
                git branch: 'main', changelog: false, poll: false, url: 'https://github.com/rk65964/DemoForJenkinsAug26.git'
            }
        }
         stage('Sonar Analysis') {
            steps {
                bat 'mvn clean package'
                bat '''mvn sonar:sonar -Dsonar.url=http://192.168.1.9:9000/ -Dsonar.login=squ_a84c856841ef1b9f2d83d89b098f5b88855a82b6 -Dsonar.projectName=DemoForJenkinsAug26 \
                    -Dsonar.java.binaries=. \
                    -Dsonar.projectKey=DemoForJenkinsAug26 '''
            }
        }
    }
}
