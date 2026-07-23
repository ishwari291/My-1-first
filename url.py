import pyshorteners
url = input("Enter URL;")

shortener =pyshorteners.shortener()
short_url = shortener.tinyurl.short(url)

print(short_url)
