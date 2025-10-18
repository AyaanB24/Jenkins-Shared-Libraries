def call(String ProjectName, String ImageTag, String DockerHubUser){
  echo "Building Docker Image!"
  sh "docker build -t ${DockerHubUser}/${ProjectName}:${ImageTag} ."
  echo "Built Docker Image sucessfully!"
}
