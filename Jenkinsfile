pipeline{
    agent any
    environment {
        PATH = "$PATH:/C:/Program Files/apache-maven-3.9.4/bin"
    }
    stages{
       stage('GetCode'){
            steps{
                git 'https://github.com/rk65964/DemoForJenkinsAug26.git'
            }
         }        
       stage('Build'){
            steps{
                sh 'mvn clean package'
            }
         }
        stage('SonarQube analysis') {
//    def scannerHome = tool 'SonarScanner 5.0.1';
        steps{
        withSonarQubeEnv('sonarserver-9.6.1') { 
        // If you have configured more than one global server connection, you can specify its name
//      sh "${scannerHome}/bin/sonar-scanner"
        sh "mvn sonar:sonar"
    }
        }
        }
       
    }
}
