node {
def mvnHome
stage('Git') {
git 'https://github.com/Ir12345/SA.git'
mvnHome = tool 'Maven'
}
stage('Maven') {
if (isUnix()) {sh "'${mvnHome}/bin/mvn' clean compile findbugs:findbugs pmd:pmd pmd:cpd checkstyle:checkstyle"}
else
{bat(/"${mvnHome}\bin\mvn" clean compile pmd:pmd pmd:cpd findbugs:findbugs checkstyle:checkstyle/)}
}
stage('PMD')  {step([$class: 'PmdPublisher', pattern: '**/pmd*.xml'])}
stage('CheckStyle') {step([$class: 'CheckStylePublisher', pattern: '**/checkstyle*.xml'])}
stage('FindBugs')  {step([$class: 'FindBugsPublisher', pattern: '**/findbugs*.xml'])}
stage('CPD')  {step([$class: 'DryPublisher', pattern: '**/cpd.xml'])}
}

