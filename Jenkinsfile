
pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                sh "mvn clean install -DskipTests"
                print('test_1')
            }
        }
        stage('Deploy') { 
              steps {
                  // sh "mvn clean install -DskipTests"
                  // print('test_1')
              }
          }

        
         
    }
    
}
