def call (String url, String branch) {
  echo "This is cloing code"
  git branch: 'main', url: 'https://github.com/shambhavik24/django-notes-app.git'
  echo "Successfully cloned the project"
  
}
