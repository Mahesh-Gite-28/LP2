Installation and Configuration of Google App Engine Using Python

1. Install Python

Download Python:

Python Official Website

During installation:

✔ Check:

Add Python to PATH
Verify Installation

Open CMD:

python --version

Example output:

Python 3.12.0 2. Install Google Cloud SDK

Download:

Google Cloud SDK Installer

Install Steps
Run installer
Keep default settings
Finish installation
Verify
gcloud version 3. Login and Initialize SDK

Open CMD:

gcloud init
It will:
Open browser
Ask Google login
Ask project selection 4. Create Google Cloud Project

Open:

Google Cloud Console

Steps:
Click New Project
Enter Project Name
Click Create

Example:

python-gae-app 5. Enable App Engine

Run:

gcloud app create
Select Region

Example:

asia-south1 6. Install App Engine Python Component

Run:

gcloud components install app-engine-python 7. Create Python Flask Application

Create folder:

mkdir myapp
cd myapp 8. Install Flask

Run:

pip install flask 9. Create Python File

Create:

main.py

Code:

from flask import Flask

app = Flask(**name**)

@app.route('/')
def home():
return "Hello Google App Engine using Python!"

if **name** == '**main**':
app.run(host='127.0.0.1', port=8080, debug=True) 10. Create requirements.txt

Create file:

requirements.txt

Add:

Flask==3.0.0
gunicorn==21.2.0 11. Create app.yaml

Create:

app.yaml

Add:

runtime: python312

entrypoint: gunicorn -b :$PORT main:app 12. Run Application Locally

Run:

python main.py

Open browser:

http://127.0.0.1:8080

Output:

Hello Google App Engine using Python! 13. Deploy Application

Run:

gcloud app deploy

Press:

Y

for confirmation.

14. Open Application

Run:

gcloud app browse

Application opens in browser.

Project Structure
myapp/
│
├── main.py
├── app.yaml
└── requirements.txt
Important Commands
Command Purpose
gcloud init Initialize SDK
gcloud app create Create App Engine
gcloud app deploy Deploy app
gcloud app browse Open app
python main.py Run locally
Advantages

1. Easy Deployment

Deploy using single command.

2. Automatic Scaling

Handles traffic automatically.

3. No Server Management

Google manages servers.

4. Python Support

Easy integration with Flask and Django.

Viva Questions
Q1. Which framework is commonly used with Python in GAE?

Flask and Django.

Q2. What is app.yaml?

Configuration file for App Engine.

Q3. Which command deploys application?
gcloud app deploy
Q4. What is Flask?

A lightweight Python web framework.

Q5. What is the purpose of requirements.txt?

Stores project dependencies.

Short Conclusion

Google App Engine allows deployment of Python applications easily using Flask and Google Cloud SDK. It provides automatic scaling, easy deployment, and serverless infrastructure management.
