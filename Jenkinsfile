pipeline
{
   environment {
    //registry = "https://hub.docker.com/repository/docker/mohangarimella/personsample"
    registry = "https://index.docker.io/mohangarimella/personsample"
    registryCreds = 'dockerhub'
    dockerImage = ''
  }    
   agent any
    
tools 
  {
    maven 'MAVEN_HOME'
    //Docker docker
  }
  stages
  {
	 stage('Clone Repository')
    {
       steps{
			// Get some code from a GitHub repository
			//git 'https://758b8dfcc43de1f727737d85ab07cbd4f47ee39f@github.com/mohangarimella/HelloWorldForDevOps'
        
          git 'https://758b8dfcc43de1f727737d85ab07cbd4f47ee39f@github.com/mohangarimella/docker-hello-world-spring-boot'
       }
	   }
	stage('Build Maven Image')
	{
       steps{
		sh 'mvn install'
		sh 'echo build done....'
		//sh 'docker build -t demo . -f src/main/docker/Dockerfile'
		
       }    
      
	}
    stage('Docker push')
    {
      steps{
          script{
                //image='sample'+ + ":$BUILD_NUMBER"
                //dockerImage=docker.build "mohangarimella/personsample" + ":$BUILD_NUMBER"
                dockerImage = docker.build("mohangarimella/personsample:$BUILD_NUMBER")

                //docker.withRegistry('https://464032280033.dkr.ecr.us-east-1.amazonaws.com/sample-microservice', 'ecr:us-east-1:ECR') {
                docker.withRegistry('https://registry-1.docker.io/v2/','dockerhub'){
                //docker.image('demo').push('1.6')
                dockerImage.push()
                }
      }
    }
}
  }
 
}
