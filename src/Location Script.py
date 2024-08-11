import geocoder

# Get the public IP address of the device
g = geocoder.ip('me')

# Extract geolocation information
latitude = g.latlng[0] if g.latlng else None
longitude = g.latlng[1] if g.latlng else None
city = g.city
state = g.state
country = g.country
ip = g.ip

# Print the results
print(f"IP Address: {ip}")
print(f"Latitude: {latitude}")
print(f"Longitude: {longitude}")
print(f"City: {city}")
print(f"State: {state}")
print(f"Country: {country}")

