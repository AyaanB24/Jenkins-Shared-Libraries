def call(String Url, String Branch){
  echo "This is cloning the code!"
  git url: "${Url}", branch: "${Branch}"
  echo "Clonned Repo Successful!"
}
