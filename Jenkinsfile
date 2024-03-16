pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                // bat 'mvn clean install -DskipTests'
                sh "mvn clean install -DskipTests"
                print('test_1')
            }
        }
        stage('Deploy') { 
              steps {
                                    print("test_2")
                  // bat 'mvn spring-boot:run'
                  // sh 'scp -i devops_assignment.pem target/demo-app.jar ubuntu@ec2-54-80-186-150.compute-1.amazonaws.com:~/'
                  // sh 'ssh -i devops_assignment.pem ubuntu@ec2-54-80-186-150.compute-1.amazonaws.com "java -jar ~/demo-app.jar"'

                  sh '''mvn spring-boot:run'''
                        print('test_3')
              }
          }

        
         
    }
    
}
