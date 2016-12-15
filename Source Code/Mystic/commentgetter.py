import praw

user_agent = ("Testing 1.0 by /u/lemonwisp")
r = praw.Reddit(user_agent = user_agent);

f = open('input.txt', 'r+')
query = f.readline()
subr = f.readline()
f.seek(0)
f.truncate
f.close();

subr = subr.strip()

results = r.search(query, subreddit = subr, limit = 1) 

for x in results:
    print x.title
    print x.id
    subm_id = x.id

submission = r.get_submission(submission_id = subm_id)
top_comment = submission.comments[0]
print (top_comment.body)

response = top_comment.body

o = open('output.txt', 'w')
o.seek(0)
o.truncate()
o.write(response)
o.close()
