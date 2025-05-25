The Phish Detector is a simple Java-based tool designed to analyze emails and estimate the likelihood that an email is spam or phishing based on the sender's email format, subject, and body content.

How it works:

Input:
The program prompts the user to enter:

The sender's email address

The email subject

The email body text

Validation and Analysis:

It first validates the sender’s email format using a regular expression to check if the email looks legitimate.

Then, it scans both the subject and the body for suspicious keywords loaded from an external file named keywords.txt.

If the subject contains two or more suspicious keywords, or the body contains three or more suspicious keywords, it flags those parts as likely spam indicators.

Spam Scoring:

Each suspicious check (email format, subject, body) increments a spam score.

The program calculates a spam likelihood percentage based on how many of these checks indicate spam.

Output:

Based on the score, the program prints whether the email is likely spam or safe.

It also cautions users that the detection is not 100% accurate and recommends manual verification.

Key Features:
Email Format Verification: Ensures the sender’s email matches a standard pattern.

Keyword Matching: Reads a customizable list of spam-related keywords from a file for flexible detection.

Simple Threshold-based Scoring: Flags emails as spam if suspicious content exceeds predefined counts.

User-friendly Console Interface: Interactive prompts and clear messages guide the user.

Use Case:
This program can be used as a lightweight preliminary spam filter, helping users quickly identify potentially harmful or phishing emails based on content and sender information.
