
pipeline {
    agent any
    stages {
        stage('Build') { 
            steps {
                print("checkpoint 1")
                bat 'mvn clean install -DskipTests'
                print('test_1')
            }
        }
        stage('Deploy') { 
              steps {

                  bat '''
plink -i devops_assignment.pem ubuntu@ec2-54-80-186-150.compute-1.amazonaws.com exit
pscp -i devops_assignment.pem target\\demo-app.jar ubuntu@ec2-54-80-186-150.compute-1.amazonaws.com:~\\
plink -i devops_assignment.pem ubuntu@ec2-54-80-186-150.compute-1.amazonaws.com "java -jar ~/demo-app.jar"
'''
                  // bat '''
                  //   pscp -i devops_assignment.pem target\\demo-app.jar ubuntu@ec2-54-80-186-150.compute-1.amazonaws.com:~\\
                  //   plink -i devops_assignment.pem ubuntu@ec2-54-80-186-150.compute-1.amazonaws.com "java -jar ~/demo-app.jar"
                  //   '''
                  // sh 'scp -i devops_assignment.pem target/demo-app.jar ubuntu@ec2-54-80-186-150.compute-1.amazonaws.com:~/'
                  // sh 'ssh -i devops_assignment.pem ubuntu@ec2-54-80-186-150.compute-1.amazonaws.com "java -jar ~/demo-app.jar"'
              }
          }

        
         
    }
    
}
