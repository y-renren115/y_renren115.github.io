require 'mechanize'

agent = Mechanize.new
page = agent.get("http://review-movie.herokuapp.com")
elements = page.search('.etc div')
puts elements
elements.each do |ele|
  puts ele.inner_text
end
